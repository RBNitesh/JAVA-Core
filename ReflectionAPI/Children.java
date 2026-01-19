public class Children {
    public Children() {
    }

    public class ChildA extends Parents.ParentA {
        public ChildA(Parents p) {
            p.super();
        }
    }

    public class ChildB extends Parents.ParentB {
        public ChildB(Parents p) {
            p.super();
        }
    }
}