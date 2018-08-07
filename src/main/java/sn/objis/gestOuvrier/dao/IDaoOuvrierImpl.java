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

import sn.objis.gestOuvrier.domaine.Metier_by_domaine;
import sn.objis.gestOuvrier.domaine.Ouvriers;
import sn.objis.gestOuvrier.utils.MysqlConnection;

/**
 * @author Zicrou
 *
 */
public class IDaoOuvrierImpl implements IDaoOuvrier{

	
	// Obtention de l'unique instance de connexion avec la base
	Connection con = MysqlConnection.getInstanceConnection();
				
	@Override
	public void create(Ouvriers o) {
		// TODO Auto-generated method stub
		try {
			//Etape1 : Création de la zone de requête
			String sql = "INSERT INTO ouvrier VALUES(null,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			//Etape 2 : transmission des valeurs aux parametres de la requête
			preparedStatement.setInt(1, o.getIdDomaine());;
			preparedStatement.setInt(2, o.getIdMetier());
			preparedStatement.setInt(3, o.getIdDepartement());
			preparedStatement.setString(4, o.getNomOuvrier());
			preparedStatement.setString(5, o.getPrenomOuvrier());
			preparedStatement.setInt(6, o.getTelephone());
			preparedStatement.setString(7, o.getEmail());
			preparedStatement.setInt(8, o.getExperience());
			//Etape 3 : exécution de la requête
			preparedStatement.executeUpdate();
			System.out.println("Insertion réussit");
		} catch (SQLException e1) {
			System.out.println("Erreur à l'insertion");
			e1.printStackTrace();
		}
	}

	@Override
	public List<Ouvriers> read() {
		List<Ouvriers> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM ouvrier";
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Ouvriers o =new Ouvriers();
				o.setIdOuvrier(resultSet.getInt("id_ouvrier"));
				o.setIdDomaine(resultSet.getInt("id_domaine"));
				o.setIdMetier(resultSet.getInt("id_metier"));
				o.setIdDepartement(resultSet.getInt("id_departement"));
				o.setNomOuvrier(resultSet.getString("nom_ouvrier"));
				o.setPrenomOuvrier(resultSet.getString("prenom_ouvrier"));
				o.setTelephone(resultSet.getInt("telephone"));
				o.setEmail(resultSet.getString("email"));
				o.setExperience(resultSet.getInt("experience"));
				list.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Ouvriers o) {
		// TODO Auto-generated method stub
		try {
			//Creation de la zone de requete
			String sql = "UPDATE ouvrier SET id_domaine = ?, id_metier = ?, id_departement = ?"
					+", nom_ouvrier = ?, prenom_ouvrier = ?, telephone = ?, email = ?, experience = ? WHERE id_ouvrier = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, o.getIdDomaine());
			preparedStatement.setInt(2, o.getIdMetier());
			preparedStatement.setInt(3, o.getIdDepartement());
			preparedStatement.setString(4, o.getNomOuvrier());
			preparedStatement.setString(5, o.getPrenomOuvrier());
			preparedStatement.executeUpdate();
			System.out.println("Modification effectué");
		} catch (SQLException e) {
			System.out.println("Erreur de mise à jour");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Ouvriers o) {
		// TODO Auto-generated method stub
		try {
			// Creation de la zone de requete
			String sql = "DELETE FROM ouvrier WHERE id_ouvrier = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, o.getIdOuvrier());
			System.out.println("Suppresion effectué");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Suppression échec");
			e.printStackTrace();
		}
	}

	@Override
	public List<Ouvriers> readOne(int id) {
		// TODO Auto-generated method stub
		List<Ouvriers> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM ouvrier WHERE id_ouvrier ="+id;
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Ouvriers o =new Ouvriers();
				o.setIdOuvrier(resultSet.getInt("id_ouvrier"));
				o.setIdDomaine(resultSet.getInt("id_domaine"));
				o.setIdMetier(resultSet.getInt("id_metier"));
				o.setIdDepartement(resultSet.getInt("id_departement"));
				o.setNomOuvrier(resultSet.getString("nom_ouvrier"));
				o.setPrenomOuvrier(resultSet.getString("prenom_ouvrier"));
				o.setTelephone(resultSet.getInt("telephone"));
				o.setEmail(resultSet.getString("email"));
				o.setExperience(resultSet.getInt("experience"));
				list.add(o);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
