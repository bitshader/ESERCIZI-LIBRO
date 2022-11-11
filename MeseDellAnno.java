import prog.utili.Data;

public enum MeseDellAnno {
    
    /*
    //COSTANTI ENUMERATIVE
    GENNAIO {
        public int numeroGiorni() {
            return 31;
        }
    },

    FEBBRAIO {
        public int numeroGiorni() {
            return 28;
        }
    },

    MARZO {
        public int numeroGiorni() {
            return 31;
        }
    },

    .....
    public abstract int numeroGiorni();
    ...

    */

    GENNAIO("Gennaio", 31), 
    FEBBRAIO("Febbraio", 28) {
        public int numeroGiorni (boolean bisestile) {
            return bisestile ? 29 : 28;
        }
    }, 
    
    MARZO("Marzo", 31),
    APRILE("Aprile", 30), MAGGIO("Maggio", 31), GIUGNO("Giugno", 30),
    LUGLIO("Luglio", 31), AGOSTO("Agosto", 31), SETTEMBRE("Settembre", 30),
    OTTOBRE("Ottobre", 31), NOVEMBRE("Novembre", 30), DICEMBRE("Dicembre", 31);

    //CAMPI 
    private String nome;
    private int numeroGiorni;

    //COSTRUTTORI
    private MeseDellAnno(String nome, int numeroGiorni) {
        this.nome = nome;
        this.numeroGiorni = numeroGiorni;
    }

    public int numeroGiorni() {
        return this.numeroGiorni;
    }

    public String toString() {
        return this.nome;
    }

    public int numeroGiorni (boolean bisestile) {
        return bisestile ? 29 : 28;
    }

    public int numeroGiorni(int anno) {
        Data d = new Data(1, 1, anno);
        return this.numeroGiorni(d.isInAnnoBisestile());
    }

    public MeseDellAnno successivo() {
        return MeseDellAnno.values() [(this.ordinal() + 1) % 12];
    }

    public MeseDellAnno precedento() {
        return MeseDellAnno.values() [this.ordinal() - 1 < 0 ? 11 : this.ordinal() - 1];
    }
}
