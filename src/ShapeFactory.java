public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        /*else if(shapeType.equalsIgnoreCase("SQUARE")){
            final Square square = new Square();
            return
                    square;
        } */
        return null;
    }
}