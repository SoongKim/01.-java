class Programmers01 {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        answer[0] = (int)(money/(double)5500);
        answer[1] = money%5500;
        return answer;
    }
}