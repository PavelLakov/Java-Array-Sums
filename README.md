
# Java Array Sum Programs

This repository contains two Java programs that compute the sums of rows and columns in a 2D array.

## Files

- **ColumnSumms.java**: This program calculates the sum of each column in a 2D array.
- **RowSums.java**: This program calculates the sum of each row in a 2D array.

## How to Use

1. Clone this repository or download the individual files.

2. Compile the Java files using a Java compiler:
   ```bash
   javac ColumnSumms.java
   javac RowSums.java
   ```

3. Run the compiled classes:
   ```bash
   java ColumnSumms
   java RowSums
   ```

## Both Programs

Both programs work on a 2D integer array defined within the code. For example:
```java
int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
```
This array is used to demonstrate the sum functionality in both the `ColumnSumms.java` and `RowSums.java` programs.

### Example Output

For `RowSums.java`:
```
Original 2D array:
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Row sums: [6, 15, 24]
```

For `ColumnSumms.java`:
```
Original 2D array:
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

Column sums: [12, 15, 18]
```

## License

This project is open-source.
Permission is hereby granted, free of charge, to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

