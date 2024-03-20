package br.com.pessoal.games.dados

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

object Banco {
    //    fun obterConexao(): Connection? {
//        return try {
//            DriverManager.getConnection("jdbc:mysql://localhost:3307/alugames", "root", "root")
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }
    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
        return factory.createEntityManager()
    }
}