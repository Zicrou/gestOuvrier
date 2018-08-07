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
import sn.objis.gestOuvrier.domaine.Region_by_pays;
import sn.objis.gestOuvrier.utils.MysqlConnection;

/**
 * @author Zicrou
 *
 */
public class IDaoRegion_by_paysImpl implements IDaoRegion_by_pays {

	// Obtention de l'unique instance de connexion avec la base
		Connection con = MysqlConnection.getInstanceConnection();
	@Override
	public void create(Region_by_pays d) {
		// TODO Auto-generated method stub
		try {
			//Etape1 : Création de la zone de requête
			String sql = "INSERT INTO region_by_pays VALUES(null,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			//Etape 2 : transmission des valeurs aux parametres de la requête
			preparedStatement.setInt(2, d.getId_pays());;
			preparedStatement.setString(3, d.getRegion());
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
	public List<Region_by_pays> read() {
		List<Region_by_pays> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM region_by_pays";
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Region_by_pays r =new Region_by_pays();
				r.setId_region(resultSet.getInt("id_region"));
				r.setId_pays(resultSet.getInt("id_pays"));
				r.setRegion(resultSet.getString("region"));
				list.add(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Region_by_pays d) {
		// TODO Auto-generated method stub
		try {
			//Creation de la zone de requete
			String sql = "UPDATE region_by_pays SET id_pays = ?, region = ? WHERE id_region = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, d.getId_pays());
			preparedStatement.setString(2, d.getRegion());
			preparedStatement.setInt(3, d.getId_region());
			preparedStatement.executeUpdate();
			System.out.println("Modification effectué");
		} catch (SQLException e) {
			System.out.println("Erreur de mise à jour");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Region_by_pays d) {
		// TODO Auto-generated method stub
		try {
			// Creation de la zone de requete
			String sql = "DELETE FROM region_by_pays WHERE id_region = ?";
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
	public List<Region_by_pays> readOne(int id) {
		// TODO Auto-generated method stub
		List<Region_by_pays> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM region_by_pays WHERE id_region ="+id;
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Region_by_pays r =new Region_by_pays();
				r.setId_region(resultSet.getInt("id_region"));
				r.setId_pays(resultSet.getInt("id_pays"));
				r.setRegion(resultSet.getString("region"));
				list.add(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
