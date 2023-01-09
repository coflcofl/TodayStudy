package lambda;

@FunctionalInterface
interface Calculate3<T> { //제네릭 기반의 함수형 인터페이스
    T cal(T a, T b);
}
