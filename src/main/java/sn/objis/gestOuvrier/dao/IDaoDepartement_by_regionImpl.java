/**
 * 
 */
package sn.objis.gestOuvrier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.gestOuvrier.domaine.Departement_by_region;
import sn.objis.gestOuvrier.domaine.Region_by_pays;
import sn.objis.gestOuvrier.utils.MysqlConnection;

/**
 * @author Zicrou
 *
 */
public class IDaoDepartement_by_regionImpl implements IDaoDepartement_by_region{

	// Obtention de l'unique instance de connexion avec la base
		Connection con = MysqlConnection.getInstanceConnection();
			
	@Override
	public void create(Departement_by_region d) {
		// TODO Auto-generated method stub
		try {
			//Etape1 : Création de la zone de requête
			String sql = "INSERT INTO departement_by_region VALUES(null,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			//Etape 2 : transmission des valeurs aux parametres de la requête
			preparedStatement.setInt(2, d.getId_region());
			preparedStatement.setString(3, d.getDepartement());
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
	public List<Departement_by_region> read() {
		// TODO Auto-generated method stub
		List<Departement_by_region> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM departement_by_region";
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Departement_by_region d =new Departement_by_region();
				d.setId_departement(resultSet.getInt("id_departement"));
				d.setId_region(resultSet.getInt("id_region"));
				d.setDepartement(resultSet.getString("departement"));
				list.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Departement_by_region d) {
		// TODO Auto-generated method stub
		try {
			//Creation de la zone de requete
			String sql = "UPDATE departement_by_region SET id_region = ?, departement = ? WHERE id_departement = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, d.getId_region());
			preparedStatement.setString(2, d.getDepartement());
			preparedStatement.setInt(3, d.getId_departement());
			preparedStatement.executeUpdate();
			System.out.println("Modification effectué");
		} catch (SQLException e) {
			System.out.println("Erreur de mise à jour");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Departement_by_region d) {
		// TODO Auto-generated method stub
		try {
			// Creation de la zone de requete
			String sql = "DELETE FROM departement_by_region WHERE id_departement = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, d.getId_region());
			System.out.println("Suppresion effectué");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Suppression échec");
			e.printStackTrace();
		}
	}

	@Override
	public List<Departement_by_region> readOne(int id_departement) {
		// TODO Auto-generated method stub
		List<Departement_by_region> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM departement_by_region WHERE id_departement ="+id_departement;
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Departement_by_region d =new Departement_by_region();
				d.setId_departement(resultSet.getInt("id_departement"));
				d.setId_region(resultSet.getInt("id_region"));
				d.setDepartement(resultSet.getString("departement"));
				list.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
