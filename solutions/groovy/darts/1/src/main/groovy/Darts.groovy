class Darts {

    static int score(x, y) {
        final outerRadius = 10
        final middleRadius = 5
        final innerRadius = 1
        
        def sum = (x).abs()**2 + (y).abs()**2
        if (sum <= innerRadius**2) {return 10}
        else if (sum <= middleRadius**2) {return 5}
        else if (sum <= outerRadius**2) {return 1}
        else {return 0}
    }
}