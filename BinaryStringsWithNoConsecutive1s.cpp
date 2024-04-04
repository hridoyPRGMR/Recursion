#include<bits/stdc++.h>
using namespace std;

void generateAns(vector<string>& ans, string str, int idx) {
    if (idx < 0) {
        ans.push_back(str);
        return;
    }

    string str1 = str;

    if (str1[idx] == '0') {
        str1[idx] = '1';
        generateAns(ans, str1, idx - 2);
    }

    str[idx] = '0';
    generateAns(ans, str, idx - 1);
}


vector<string> generateString(int N) {
    vector<string> ans;
    string str = "";
    for (int i = 0; i < N; i++) {
        str += '0';
    }
    generateAns(ans, str, N - 1);
    return ans;
}

int main() {

    int n = 4;
    vector<string> ans = generateString(n);

    for (string it : ans) {
        cout << it << endl;
    }

    return 0;
}
