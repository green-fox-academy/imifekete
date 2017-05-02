public class Hero extends Character {

  Hero() {
    super(20 + 3 * ((int)((Math.random() * 6)) + 1), 2 * ((int)((Math.random() * 6)) + 1), 5 + ((int)((Math.random() * 6)) + 1));
    this.setPosX(0);
    this.setPosY(0);
    this.setCostume("assets/hero-down.png");
  }



}