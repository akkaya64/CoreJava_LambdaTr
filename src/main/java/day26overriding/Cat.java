package day26overriding;


public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats meow...");
    }

    // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
    // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
    // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
    // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.
    @Override//Override Annotation'ı ==>@  override yaparsan parantezin içine bir şey yazma. methodun ismine de dokunma
    //override kurallarının Java tarafından kontrol edilmesini sağlar
    public void eat() {//Child'daki override edilmiş eat() methoduna "Overriding Method" denir.
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink..");
    }

    @Override
    public Animal create() {// new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin
        // olusturdugumuz Cat'i Animal data type'ina koyabiliriz.
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {//Wrapper classlar arasinda  "is A" iliskisi olmadigindan
                                           // return type degisirilemez...
        return a * b;
    }


}
