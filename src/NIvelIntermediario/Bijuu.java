package NIvelIntermediario;

public enum Bijuu {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Gokū", "Rōshi", 4),
    KOKO("Kokuō", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chōmei", "Fū", 7),
    GYUKI("Gyūki", "Killer Bee", 8),
    KURAMA("Kurama", "Uzumaki Naruto", 9)
    ;

    String nome;
    String bijuuJinchuuriki;
    int numeroDeCaudas;

    Bijuu() {
    }

    Bijuu(String nome, String bijuuJinchuuriki, int numeroDeCaudas) {
        this.nome = nome;
        this.bijuuJinchuuriki = bijuuJinchuuriki;
        this.numeroDeCaudas = numeroDeCaudas;
    }
}
