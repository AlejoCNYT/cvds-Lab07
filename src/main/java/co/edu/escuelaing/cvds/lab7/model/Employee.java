package co.edu.escuelaing.cvds.lab7.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEES LIST")
public class Employee {
    @Id
    @Column(name = "ID")
    private String propiedad;
    @Column(name = "FIRST NAME")
    private String valor;
    @Column(name = "LAST NAME")
    private String value;

    public Employee() {
    }

    public Employee(String propiedad, String valor) {
        this.propiedad = propiedad;
        this.valor = valor;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((propiedad == null) ? 0 : propiedad.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
            Employee other = (Employee) obj;
        if (propiedad == null) {
            if (other.propiedad != null)
                return false;
        } else if (!propiedad.equals(other.propiedad))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Configuration [propiedad = " + propiedad + ", valor = " + valor + "]";
    }
}
