class ComparingStrings {
    public static void main(String[] args) {
        // trois versions du même String
        String s1 = "texte";
        String s2 = new String("texte");
        System.out.print("Entrez le mot 'texte' : ");
        String s3 = System.console().readLine();

        String[] same = {s1, s2, s3};

        for (int i = 0; i < same.length - 1; i++) {
            System.out.println(same[i] + ", " + same[i+1]);
            System.out.println(same[i].hashCode() + ", " + same[i+1].hashCode() );
            System.out.println(same[i] == same[i+1]);
            System.out.println(same[i].equals(same[i+1]));
            System.out.println();
        }

        HdmiPort hp = new HdmiPort();
        System.out.println(hp);
    }
}