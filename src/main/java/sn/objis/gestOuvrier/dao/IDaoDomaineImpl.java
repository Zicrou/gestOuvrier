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

import sn.objis.gestOuvrier.domaine.Domaine;
import sn.objis.gestOuvrier.utils.MysqlConnection;


/**
 * @author Zicrou
 *
 */
public class IDaoDomaineImpl implements IDaoDomaine{

	// Obtention de l'unique instance de connexion avec la base
		Connection con = MysqlConnection.getInstanceConnection();

		public void create(Domaine d) {
			// TODO Auto-generated method stub
			try {
				//Etape1 : Création de la zone de requête
				String sql = "INSERT INTO domaine VALUES(?)";
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				//Etape 2 : transmission des valeurs aux parametres de la requête
				preparedStatement.setString(2, d.getDomaine());
				//preparedStatement.setString(1, null);
				//Etape 3 : exécution de la requête
				preparedStatement.executeUpdate();
				System.out.println("Insertion réussit");
			} catch (SQLException e1) {
				System.out.println("Erreur à l'insertion");
				e1.printStackTrace();
			}
			
		}

		public List<Domaine> read() {
			List<Domaine> list = new ArrayList<>();
			try {
				//Etape 1 : Création de la zone de reqête
				String sql = "SELECT * FROM domaine";
				Statement statement = con.createStatement();
				//Etape 2: Exécution de la requête
				ResultSet resultSet = statement.executeQuery(sql);
				//Traitement du resultat
				
				while(resultSet.next()) {
					Domaine d =new Domaine();
					d.setId_domaine(resultSet.getInt(1));
					d.setDomaine(resultSet.getString("domaine"));
					list.add(d);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		public void update(Domaine d) {
			try {
				//Creation de la zone de requete
				String sql = "UPDATE domaine SET domaine = ? WHERE id_domaine = ?";
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1, d.getDomaine());
				preparedStatement.setInt(2, d.getId_domaine());
				preparedStatement.executeUpdate();
				System.out.println("Modification effectué");
			} catch (SQLException e) {
				System.out.println("Erreur de mise à jour");
				e.printStackTrace();
			}
			
		}

		public void delete(Domaine d) {
			try {
				// Creation de la zone de requete
				String sql = "DELETE FROM domaine WHERE id_domaine = ?";
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setInt(1, d.getId_domaine());
				System.out.println("Suppresion effectué");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Suppression échec");
				e.printStackTrace();
			}
			
		}

		@Override
		public List<Domaine> readOne(int id) {
			// TODO Auto-generated method stub
			List<Domaine> list = new ArrayList<>();
			try {
				//Etape 1 : Création de la zone de reqête
				String sql = "SELECT * FROM domaine WHERE id_ ="+id;
				Statement statement = con.createStatement();
				//Etape 2: Exécution de la requête
				ResultSet resultSet = statement.executeQuery(sql);
				//Traitement du resultat
				
				while(resultSet.next()) {
					Domaine d =new Domaine();
					d.setId_domaine(resultSet.getInt(1));
					d.setDomaine(resultSet.getString("domaine"));
					list.add(d);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		

}
