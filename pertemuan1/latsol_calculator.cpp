#include <iostream>

using namespace std;

int main() {
  int n;
  double tugas, uts, uas;

  cin >> n;
  double nilaiAkhir[n];
  char grade[n];

  for (int i = 0; i < n; i++) {
    cin >> tugas >> uts >> uas;

    nilaiAkhir[i] =
        tugas * (30.0 / 100) + uts * (35.0 / 100) + uas * (35.0 / 100);

    if (nilaiAkhir[i] >= 80) {
      grade[i] = 'A';
    } else if (nilaiAkhir[i] >= 70) {
      grade[i] = 'B';
    } else if (nilaiAkhir[i] >= 60) {
      grade[i] = 'C';
    } else if (nilaiAkhir[i] >= 50) {
      grade[i] = 'D';
    } else {
      grade[i] = 'E';
    }
  }

  for (int i = 0; i < n; i++) {
    cout << "Nilai Akhir: " << nilaiAkhir[i] << " | Grade: " << grade[i]
         << endl;
  }

  return 0;
}
