package HarryPotterCode.composants;

public class Wand {
    private static class Core {
        private int Size;
        public Core(int size) {
            this.Size = size;
        }
    }
    public record Size(int length) {
        public Size {
            if (length < 0) {
                throw new IllegalArgumentException("La longueur doit être positive");
            }
        }
    }
}
