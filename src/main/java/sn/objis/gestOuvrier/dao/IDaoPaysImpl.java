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

import sn.objis.gestOuvrier.domaine.Pays;
import sn.objis.gestOuvrier.domaine.Pays;
import sn.objis.gestOuvrier.utils.MysqlConnection;

/**
 * @author Zicrou
 *
 */
public class IDaoPaysImpl implements IDaoPays{

	// Obtention de l'unique instance de connexion avec la base
		Connection con = MysqlConnection.getInstanceConnection();
		
	@Override
	public void create(Pays p) {
		// TODO Auto-generated method stub
		try {
			//Etape1 : Création de la zone de requête
			String sql = "INSERT INTO pays VALUES(null,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			//Etape 2 : transmission des valeurs aux parametres de la requête
			preparedStatement.setString(2, p.getPays());
			//Etape 3 : exécution de la requête
			preparedStatement.executeUpdate();
			System.out.println("Insertion réussit");
		} catch (SQLException e1) {
			System.out.println("Erreur à l'insertion");
			e1.printStackTrace();
		}
	}

	@Override
	public List<Pays> read() {
		// TODO Auto-generated method stub
		List<Pays> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM pays";
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Pays d =new Pays();
				d.setIdPays(resultSet.getInt("id_pays"));
				d.setPays(resultSet.getString("pays"));
				list.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Pays p) {
		// TODO Auto-generated method stub
		try {
			//Creation de la zone de requete
			String sql = "UPDATE pays SET pays = ? WHERE id_pays = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, p.getIdPays());
			preparedStatement.setString(2, p.getPays());
			preparedStatement.executeUpdate();
			System.out.println("Modification effectué");
		} catch (SQLException e) {
			System.out.println("Erreur de mise à jour");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Pays p) {
		// TODO Auto-generated method stub
		try {
			// Creation de la zone de requete
			String sql = "DELETE FROM pays WHERE id_pays = ?";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, p.getIdPays());
			System.out.println("Suppresion effectué");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Suppression échec");
			e.printStackTrace();
		}
	}

	@Override
	public List<Pays> readOne(int id) {
		// TODO Auto-generated method stub
		List<Pays> list = new ArrayList<>();
		try {
			//Etape 1 : Création de la zone de reqête
			String sql = "SELECT * FROM pays WHERE id_pays ="+id;
			Statement statement = con.createStatement();
			//Etape 2: Exécution de la requête
			ResultSet resultSet = statement.executeQuery(sql);
			//Traitement du resultat
			
			while(resultSet.next()) {
				Pays p =new Pays();
				p.setIdPays(resultSet.getInt("id_pays"));
				p.setPays(resultSet.getString("pays"));
				list.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
