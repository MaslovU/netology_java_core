package homework2_lambda;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}