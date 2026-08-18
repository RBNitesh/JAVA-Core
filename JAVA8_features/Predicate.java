import java.util.*;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) && other.test(t);
    }

    default Predicate<T> negate() {
        return t -> !this.test(t);
    }

    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) || other.test(t);
    }

    static <T> Predicate<T> isEqual(Object targetRef) {
        return t -> Objects.equals(t, targetRef);
    }

    static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return t -> !target.test(t);
    }
}
