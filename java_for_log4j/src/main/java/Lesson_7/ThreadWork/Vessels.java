package Lesson_7.ThreadWork;

enum Vessels {
    Cargo(400),Food(800),Tanker(1500);
    private int capacity;
    Vessels(int i) {
        capacity = i;
    }
    public int getCapacity() {
        return capacity;
    }
}