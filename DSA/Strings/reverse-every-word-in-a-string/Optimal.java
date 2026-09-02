class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();

        int n = a.length;
        int write = 0;
        int i = 0;

        while (i < n) {
            while (i < n && a[i] == ' ') i++;
            if (i == n) break;

            if (write > 0) a[write++] = ' ';

            int start = write;

            while (i < n && a[i] != ' ')
                a[write++] = a[i++];

            reverse(a, start, write - 1);
        }

        reverse(a, 0, write - 1);

        return new String(a, 0, write);
    }

    private void reverse(char[] a, int l, int r) {
        while (l < r) {
            char temp = a[l];
            a[l++] = a[r];
            a[r--] = temp;
        }
    }
}