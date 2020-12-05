package homework2_lambda;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String res);
}
