package academy.learnprogramming;

public class Printer {
    private int toner;
    private int pages;
    private boolean duplex;

    public Printer(int pages, boolean duplex) {
        this.toner = 100;
        this.pages = pages;
        this.duplex = duplex;
    }

    public void fillToner(int fill) {
        this.toner += fill;
        if (this.toner>100) {
            this.toner=100;

        }
        System.out.println("Toner is " + this.toner + "% full.");
    }

    public void addPaper(int paper) {
        this.pages+=paper;
        System.out.println("Paper leveL: "+pages);
    }

    public void printPages(int qty) {
        int reqPages = 0;
        if (duplex) {
            reqPages = qty/2;
        } else {
            reqPages = qty;
        }

        if (toner>=qty && pages>=reqPages) {
            toner -= qty;
            pages -= reqPages;
            if (duplex) {
                System.out.println("Printed "+reqPages+" pages double-sided.");
            } else {
                System.out.println("Printed "+reqPages+" pages single-sided.");
            }
            System.out.println("Toner level: "+toner);
            System.out.println("Paper level: "+pages);
        } else {
            if (toner<qty) {
                System.out.println("Insufficient toner. Add toner.");
            } else {
                System.out.println("Insufficient paper. Add paper.");
            }
        }
    }

}
