package unit5_c2_q3;

// in this question Interface Segeration Priciple is violating. Now we are fixing it.

public class DiskRealmManager implements DataManager2 {
    @Override
    public void Read() {

    }

    @Override
    public void write() {

    }
}

class DiskCoreDataManager implements DataManager2{

    @Override
    public void Read() {

    }

    @Override
    public void write() {

    }
}
class InMemoryRealmManager implements DataManager1{

    @Override
    public void Read() {

    }
}

class Main{
    public static void main(String[] args) {

        DataManager2 dm = new DiskRealmManager();
        dm.write();
        dm.Read();
        DataManager1 dm1 = new InMemoryRealmManager();
        dm1.Read();

        DataManager2 dm2 = new DiskCoreDataManager();
        dm.Read();
        dm.write();

    }
}
