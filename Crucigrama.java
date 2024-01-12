public class Crucigrama {
    public static void main(String[] args) {
        char[][] crucigrama = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#'},
                {'#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#'},
                {'#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        for (int i = 0; i < crucigrama.length; i++) {
            for (int j = 0; j < crucigrama[i].length; j++) {
                System.out.print(crucigrama[i][j] + " ");
            }
            System.out.println();
        }
    }
}
