package q2;

public class Main {
    public static void main(String[] args) {
        final float CAMPO_FUTEBOL = (float) 8250.0;

        System.out.println("Campo de futebol em metros: " + CAMPO_FUTEBOL);
        System.out.println("Campo de futebol em pés quadrados: " + campoParaPe(CAMPO_FUTEBOL));
        System.out.println("Campo de futebol em acres: " + campoParaAcre(CAMPO_FUTEBOL));
        System.out.println("Campo de futebol em centímetros quadrados: " + campoParaCm(CAMPO_FUTEBOL));

    }

    public static float campoParaPe(float campo) {
        return ConversaoDeUnidadesDeArea.metroParaPe(campo);
    }

    public static float campoParaAcre(float campo) {
        float campoEmPe = campoParaPe(campo);
        return campoEmPe / ConversaoDeUnidadesDeArea.getAcrePeQuadrado();
    }

    public static float campoParaCm(float campo) {
        float campoEmPe = campoParaPe(campo);
        return ConversaoDeUnidadesDeArea.peParaCm(campoEmPe);
    }
}
