package Structural.Filter;

        import java.util.ArrayList;

public class GreaterThan implements FilterInterface {

    /**
     * 参数
     */
    private int parameter;

    private ArrayList<Part> result = new ArrayList<>();

    public GreaterThan(int parameter) {
        this.parameter = parameter;
    }

    @Override
    public ArrayList<Part> filterAction(ArrayList<Part> partArrayList) {
        for (Part singlePart : partArrayList){
            if (singlePart.getWidth() > parameter){
                result.add(singlePart);
            }
        }

        return result;
    }
}
