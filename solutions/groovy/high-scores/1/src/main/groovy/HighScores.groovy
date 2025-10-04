class HighScores {
    private List<Integer> scoreList

    HighScores(List<Integer> scores) {
        this.scoreList = scores.clone() as List<Integer>
    }

    List<Integer> getScores() {
        return scoreList.clone() as List<Integer>
    }

    Integer latest() {
        return scoreList[-1]
    }

    Integer personalBest() {
        return scoreList.max()
    }

    List<Integer> personalTopThree() {
        return scoreList.sort(false) { -it }.take(3)
    }
}