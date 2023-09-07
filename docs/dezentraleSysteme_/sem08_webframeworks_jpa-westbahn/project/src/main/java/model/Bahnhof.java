package model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@NamedQueries ({@NamedQuery(name="Bahnhof.getAll",query="SELECT b from Bahnhof b")})
public class Bahnhof {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;

	@Size(min=2,max=150,message="Bahnhofname muss mindestens 2 und maximal 150 Zeichen lang sein!")
	@Column(name="name",unique=true)
	private String name;

	private int absPreisEntfernung;
	private int absKmEntfernung;
	private int absZeitEntfernung;

	@Type(type="yes_no")
	private boolean kopfBahnhof;

        public Bahnhof() {
        }

	public Bahnhof(String name, int absPreisEntfernung, int absKmEntfernung, int absZeitEntfernung,
			boolean kopfBahnhof) {
		super();
		this.name = name;
		this.absPreisEntfernung = absPreisEntfernung;
		this.absKmEntfernung = absKmEntfernung;
		this.absZeitEntfernung = absZeitEntfernung;
		this.kopfBahnhof = kopfBahnhof;
	}
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAbsPreisEntfernung() {
		return absPreisEntfernung;
	}

	public void setAbsPreisEntfernung(int absPreisEntfernung) {
		this.absPreisEntfernung = absPreisEntfernung;
	}

	public int getAbsKmEntfernung() {
		return absKmEntfernung;
	}

	public void setAbsKmEntfernung(int absKmEntfernung) {
		this.absKmEntfernung = absKmEntfernung;
	}

	public int getAbsZeitEntfernung() {
		return absZeitEntfernung;
	}

	public void setAbsZeitEntfernung(int absZeitEntfernung) {
		this.absZeitEntfernung = absZeitEntfernung;
	}

	public boolean isKopfBahnhof() {
		return kopfBahnhof;
	}

	public void setKopfBahnhof(boolean kopfBahnhof) {
		this.kopfBahnhof = kopfBahnhof;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bahnhof))
			return false;
		Bahnhof other = (Bahnhof) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

}
