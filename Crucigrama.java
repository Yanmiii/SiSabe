public class Crucigrama {
    public static void main(String[] args) {
        char[][] crucigrama = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', ' ', '#'},
                {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
                {'#', ' ', '#', ' ', '#', ' ', '#', '#', '#', '#'},
                {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        String[] palabrasHorizontales = {"JAVA", "CRUCIGRAMA", "GITHUB", "VERTICAL"};
        String[] palabrasVerticales = {"HOLA", "WORLD", "CODE", "API", "REPO", "GIT"};

        // Colocar palabras horizontales
        for (int i = 1; i < 5; i++) {
            String palabra = palabrasHorizontales[i - 1];
            for (int j = 1; j <= palabra.length(); j++) {
                crucigrama[i][j] = palabra.charAt(j - 1);
            }
        }

        // Colocar palabras verticales
        for (int j = 1; j < 9; j++) {
            String palabra = palabrasVerticales[j - 1];
            for (int i = 1; i <= palabra.length(); i++) {
                crucigrama[i][j] = palabra.charAt(i - 1);
            }
        }

        // Imprimir crucigrama
        for (int i = 0; i < crucigrama.length; i++) {
            for (int j = 0; j < crucigrama[i].length; j++) {
                System.out.print(crucigrama[i][j] + " ");
            }
            System.out.println();
        }
    }
}
