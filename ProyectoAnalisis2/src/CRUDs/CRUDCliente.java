
package CRUDs;

import POJOs.Cliente;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class CRUDCliente {
     public static List<Cliente> universo() {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        List<Cliente> lista = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Cliente.class);
            criteria.add(Restrictions.eq("estado", true));
            criteria.addOrder(Order.desc("idCliente"));
            criteria.setMaxResults(500);
            lista = criteria.list();
        } catch (HibernateException e) {
            System.out.println("Error " + e);
        } finally {
            session.getTransaction().commit();
        }
        return lista;
    }
    
    public static Cliente select(String primerNombre) {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.setMaxResults(1);
        criteria.add(Restrictions.eq("primerNombre", primerNombre));
        Cliente select = (Cliente) criteria.uniqueResult();
        if (select == null) {
            select = new Cliente();
            select.setIdCliente(0);
        }
        session.close();
        return select;
    }
    
    public static boolean crear(String nombre1, String nombre2, String apellido1, String apellido2) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("primerNombre", nombre1));
        criteria.add(Restrictions.eq("segundoNombre", nombre2));
        criteria.add(Restrictions.eq("primerApellido", apellido1));
        criteria.add(Restrictions.eq("segundoApellido", apellido2));
        criteria.add(Restrictions.eq("estado", true));
        Cliente insrt = (Cliente) criteria.uniqueResult();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if (insrt == null) {
                insrt = new Cliente();
                insrt.setEstado(true);
                insrt.setPrimerNombre(nombre1);
                insrt.setSegundoNombre(apellido2);
                insrt.setPrimerApellido(apellido1);
                insrt.setSegundoApellido(apellido2);
                insrt.setUsuarioIngreso(1);
                insrt.setFechaIngreso(fecha);
                session.save(insrt);
                flag = true;
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("error" + e);
        } finally {
            session.close();
        }
        return flag;
    }
    
    public static boolean actualizar(Integer idCliente, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("idCliente", idCliente));
        Cliente updt = (Cliente) criteria.uniqueResult();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if (updt != null) {
                updt.setPrimerNombre(primerNombre);
                updt.setSegundoNombre(segundoNombre);
                updt.setPrimerApellido(primerApellido);
                updt.setSegundoApellido(segundoApellido);
                updt.setUsuarioModifica(1);
                updt.setFechaModifica(fecha);
                session.update(updt);
                flag = true;
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("error" + e);
        } finally {
            session.close();
        }
        return flag;
    }
    
    public static boolean anular(Integer idCliente) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("idCliente", idCliente));
        Cliente update = (Cliente) criteria.uniqueResult();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if (update != null) {
                update.setEstado(false);
                update.setUsuarioModifica(1);
                update.setFechaModifica(fecha);
                session.update(update);
                flag = true;
            }
            transaction.commit();
        } catch (HibernateException e) {
            System.out.println("Error: " + e);
            transaction.rollback();
        } finally {
            session.close();
        }
        return flag;
    }
}
