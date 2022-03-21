package composition;


class Dompet{
    Uang money;
    Kartu jenis;
    
    Dompet(Uang money, Kartu jenis){
        this.money = money;
        this.jenis = jenis;
    }

    public Uang getMoney() {
        return money;
    }

    public void setMoney(Uang money) {
        this.money = money;
    }

    public Kartu getjenis() {
        return jenis;
    }

    public void setjenis(Kartu jenis) {
        this.jenis = jenis;
    }
    
    
}