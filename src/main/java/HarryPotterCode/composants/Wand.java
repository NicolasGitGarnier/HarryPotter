package HarryPotterCode.composants;

public class Wand {
    private static class core {
        private int size;
        public core(int size) {
            this.size = size;
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
