package koschei.models;

import org.springframework.stereotype.Component;

public class Egg6 {
    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", � ���� ������ " + needle.toString();
    }
}
