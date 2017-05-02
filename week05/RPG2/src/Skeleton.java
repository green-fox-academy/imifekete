public class Skeleton extends Character {


  boolean hasKey;

  Skeleton(int level, boolean hasKey) {
    super(2 * level * ((int)((Math.random() * 6)) + 1), level/2 * ((int)((Math.random() * 6)) + 1), level * ((int)((Math.random() * 6)) + 1));
    this.hasKey = true;
  }


}
