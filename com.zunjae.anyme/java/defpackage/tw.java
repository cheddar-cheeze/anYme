package defpackage;

public final class tw {
    public static final int a = 1;
    public static final int b = 2;
    private static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[b];
        iArr[0] = a;
        iArr[a] = b;
        c = iArr;
    }

    public static int[] a() {
        return (int[]) c.clone();
    }
}
