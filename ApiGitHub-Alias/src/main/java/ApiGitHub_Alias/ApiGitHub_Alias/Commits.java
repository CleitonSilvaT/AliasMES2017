package ApiGitHub_Alias.ApiGitHub_Alias;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.egit.github.core.Authorization;
import org.eclipse.egit.github.core.IRepositoryIdProvider;
import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.RepositoryService;

import info.debatty.java.stringsimilarity.Levenshtein;


public class Commits {

	static ArrayList<Person> users = new ArrayList<Person>();
	static ArrayList<Alias> aliasName = new ArrayList<Alias>();
	static ArrayList<Alias> aliasEmail = new ArrayList<Alias>();
	static ArrayList<Alias> aliasLevensthein = new ArrayList<Alias>();
	

	public static void main(String[] args) throws IOException {

		String token = "dcc5ac47b66a2e64e4d6eb63a3fd04fdb3c9695d";
		String url;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a URL:");
		url = scan.nextLine();
		
		Commits service = new Commits();
		service.start(token, url);

		//Nome igual e Email diferente
		heuristica1();
		
		//Email igual e Nomes diferente
		heuristica2();
		
//		//Nome parecidos Levensthein
//		double trashold = 2.0;
//		heuristica3(trashold);
		
		printTotais();
		
		
		System.out.println("");
		System.out.println("Relatório de Alias com Nomes Iguais");
		System.out.println("#######################################");
		
		printAlias(aliasName);

		
		System.out.println("");
		System.out.println("Relatório de Alias com Emails Iguais");
		System.out.println("#######################################");
		
		printAlias(aliasEmail);
		
		
//		System.out.println("");
//		System.out.println("Relatório de Alias com Nomes Levensthein");
//		System.out.println("#######################################");
//		
//		printAlias(aliasLevensthein);
	}

	public void start(String pAccessToken, String url) throws IOException {

		GitHubClient client = new GitHubClient();
		client.setOAuth2Token(pAccessToken);
		

		RepositoryService repoServ = new RepositoryService(client);

		final int size = 25;

		//Adicionar elemtos que não são repetidos
		Set<String> data = new HashSet<String>();

		ArrayList<String> dataArray = new ArrayList<String>();

		//https://github.com/airbnb/javascript
		
		RepositoryId repo = null;
		repo = RepositoryId.createFromUrl(url);
		
		
		final CommitService service = new CommitService(client);

		System.out.println("Recuperando informações dos Commits");
		
		for (Collection<RepositoryCommit> commits : service.pageCommits(repo,size)) {
		
			System.out.print(".");

			for (RepositoryCommit commit : commits) {

				String a;

				a = commit.getCommit().getAuthor().getName()+"/"+commit.getCommit().getAuthor().getEmail();

				data.add(a);
			}
		}


		//Adicionando elementos que não são repetidos em ArrayList para serem tratados
		dataArray.addAll(data);



		//Criando um objeto com o nome e email separados
		for(int i = 0;i<dataArray.size();i++) {

			String[] test = new String[2]; 
			test = dataArray.get(i).split("/");

			Person people = new Person();
			people.setName(test[0]);
			people.setEmail(test[1]);

			users.add(people);
		}


		
	}
	
	
	public static void heuristica1() {

		//Nome igual e Email diferente
		for(int i = 0;i<users.size();i++) {
			for(int j = i+1;j<users.size();j++) {

				if (users.get(i).getName().equals(users.get(j).getName())){
					if (!users.get(i).getEmail().equals(users.get(j).getEmail())) {

						Alias tmp = new Alias();
						tmp.setPerson1(users.get(i));
						tmp.setPerson2(users.get(j));

						aliasName.add(tmp);

						i++;
					}
				}
			}
		}

	}
	
	public static void heuristica2() {
		
		//Email igual e Nomes diferente
		for(int i = 0;i<users.size();i++) {
			for(int j = i+1;j<users.size();j++) {

				if (users.get(i).getEmail().equals(users.get(j).getEmail())){
					if (!users.get(i).getName().equals(users.get(j).getName())) {
						Alias tmp = new Alias();
						tmp.setPerson1(users.get(i));
						tmp.setPerson2(users.get(j));

						aliasEmail.add(tmp);

						i++;
					}
				}
			}
		}
		
	}
	
	public static void heuristica3(double valor) {
		Levenshtein l = new Levenshtein();
		
		//Nome parecidos Levensthein
		for(int i = 0;i<users.size();i++) {
			for(int j = i+1;j<users.size();j++) {

				if ( l.distance(users.get(i).getName(), users.get(j).getName()) <= valor){
					Alias tmp = new Alias();
					tmp.setPerson1(users.get(i));
					tmp.setPerson2(users.get(j));

					aliasLevensthein.add(tmp);

					i++;
				}
			}
		}

		 
	}
	
	public static void printTotais() {

		System.out.println("");
		System.out.println("");
		System.out.println("Total de Usuários que realizaram Commits - " + users.size());
		
		System.out.println("");
		
		
		System.out.println("Total de Alias com Nomes Iguais - "+aliasName.size());
		System.out.println("Total de Alias com Emails Iguais - "+aliasEmail.size());
		System.out.println("Total de Alias com Nomes Levensthein - "+aliasLevensthein.size());

		//int total = aliasName.size() + aliasEmail.size() + aliasLevensthein.size();
		int total = aliasName.size() + aliasEmail.size();
		System.out.println("Total de Alias Encontrado - "+ total);
	}
	
	public static void printAlias(ArrayList<Alias> aliasTmp) {
		
		for(int i = 0;i<aliasTmp.size();i++) {
			int j = i+1;
			System.out.println("");
			System.out.println("Alias " + j);
			System.out.println(aliasTmp.get(i).getPerson1().getName() + " - " + aliasTmp.get(i).getPerson2().getName());
			System.out.println(aliasTmp.get(i).getPerson1().getEmail() + " - " + aliasTmp.get(i).getPerson2().getEmail());
		}
	}
}