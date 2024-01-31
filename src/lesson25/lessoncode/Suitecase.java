package lesson25.lessoncode;

public class Suitecase {

    /*
    2) Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
Создать =две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам - размеру и материалу и цвету
     */
    String material;
    String size;
    String colour;

    public Suitecase(String material, String size, String colour) {
        this.material = material;
        this.size = size;
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Suitecase{" +
                "material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
