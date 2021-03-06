/**
 * 
 */
package sn.objis.gestOuvrier.utils;

/**
 * @author Zicrou
 *
 * Cette classe met en oeuvre le design pattern singleton
 * elle permet de restreindre les accés à la base en une et une seule instance de
 * connection
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {

	private static String url="jdbc:mysql://localhost/gestouvrier?useSSL=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String userDb="zicrou";
	private static String pwdDb="ouvrier";
	private static Connection conn= null;//l'unique instance de connexion à la base
	
	//Constructeur privé pour blocquer la création d'instance de la classe
	private MysqlConnection() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Cette methode retourne l'unique oinstance de connection avec la base
	 * @return
	 */
	public static Connection getInstanceConnection(){
		try {
			if(conn==null) {// Accune connexion avec la base
				conn=DriverManager.getConnection(url, userDb, pwdDb);
				System.out.println("Connexion établie avec la base");
			}
		} catch (SQLException e) {
			System.out.println("Probléme de connexion");
			e.printStackTrace();
		}
		return conn;
	}
	
}
