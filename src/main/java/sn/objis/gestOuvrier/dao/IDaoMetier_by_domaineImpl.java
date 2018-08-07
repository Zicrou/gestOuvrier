package sn.objis.gestOuvrier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.gestOuvrier.domaine.Domaine;
import sn.objis.gestOuvrier.domaine.Metier_by_domaine;
import sn.objis.gestOuvrier.utils.MysqlConnection;

public class IDaoMetier_by_domaineImpl implements IDaoMetier_by_domaine{

	// Obtention de l'unique instance de connexion avec la base
		Connection con = MysqlConnection.getInstanceConnection();

	@Override
	public void create(Metier_by_domaine m) {
		// TODO Auto-generated method stub
		try {
			//Etape1 : Création de la zone de requête
			String sql = "INSERT INTO metier_by_domaine VALUES(?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			//Etape 2 : transmission des valeurs aux parametres de la requête
			preparedStatement.setInt(1, 0);;
			preparedStatement.setInt(2, m.getIdDomaine());
			preparedStatement.setString(3, m.getMetier());
			//preparedStatement.setString(1, null);
			//Etape 3 : exécution de la requête
			preparedStatement.executeUpdate();
			System.out.println("Insertion réussit");
		} catch (SQLException e1) {
			System.out.println("Erreur à l'insertion");
			e1.printStackTrace();
		}
	}

	@Override
	public List<Metier_by_domaine> read() {
		List<Metier_by_domaine> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM metier_by_domaine";
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Metier_by_domaine m =new Metier_by_domaine();
				m.setIdMetier(resultSet.getInt("id_metier"));
				m.setIdDomaine(resultSet.getInt("id_domaine"));
				m.setMetier(resultSet.getString("metier"));
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Metier_by_domaine m) {
		// TODO Auto-generated method stub
		try {
			//Creation de la zone de requete
			String sql = "UPDATE metier_by_domaine SET metier = ? WHERE id_metier = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, m.getMetier());
			preparedStatement.setInt(2, m.getIdMetier());
			preparedStatement.executeUpdate();
			System.out.println("Modification effectué");
		} catch (SQLException e) {
			System.out.println("Erreur de mise à jour");
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Metier_by_domaine m) {
		// TODO Auto-generated method stub
		try {
			// Creation de la zone de requete
			String sql = "DELETE FROM metier_by_domaine WHERE id_metier = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, m.getIdMetier());
			System.out.println("Suppresion effectué");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Suppression échec");
			e.printStackTrace();
		}
	}

	@Override
	public List<Metier_by_domaine> readOne(int id) {
		// TODO Auto-generated method stub
		 List<Metier_by_domaine> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM metier_by_domaine WHERE id_ ="+id;
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Metier_by_domaine m =new Metier_by_domaine();
				m.setIdMetier(resultSet.getInt("id_metier"));
				m.setIdDomaine(resultSet.getInt("id_domaine"));
				m.setMetier(resultSet.getString("metier"));
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
