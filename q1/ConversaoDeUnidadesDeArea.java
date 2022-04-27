package q1;

public class ConversaoDeUnidadesDeArea {
    private static float peQuadrado = (float) 10.76;
    private static float cmQuadrado = (float) 929;
    private static float acres = (float) 640;
    private static float acrePeQuadrado = (float) 43.560;

    public static float metroParaPe(float metro) {
        return metro * peQuadrado;
    }

    public static float peParaCm(float pe) {
        return pe * cmQuadrado;
    }

    public static float milhaParaAcre(float milha) {
        return milha * acres;
    }

    public static float acreParaPe(float acre) {
        return acre * acrePeQuadrado;
    }

}
