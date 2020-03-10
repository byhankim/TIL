### March 6 '20
- scanf returns EOF when there's no input, file io or not
- struct member could be used as: student[0].num OR (student + 0)->num

### Mar 9-10 '20
- mainly cpp
  - short history of cpp
  - comlilation command for various OS
  - concepts of preprocessor/namespace  simple stdio
  - carriage return / line feed / white spaces
  - cin/cout class
  - functions with/w.o a return value
- bits n bytes for various computer systems
- primitive data types & how to init em
  - in c++11
    ```c
    int hamburgers = { 24 };  // just like arrays and structures
    int blahblah { 8 };       // no need for = sign
    int foobar { };           // will init to 0
    ```
  - char, short, int, long, long long and their size in different architecture systems
  - how to print numbers (in different bases using cout object)
    ```c
    cout << hex;    // hexadecimal
    cout << oct;    // octal
    cout << dec;    // decimal, default
    ```
  - escape sequences
  - wchar_t, char16_t, char32_t
  - bool (0 ? false : true)
- floating point numbers
  - two ways of displaying it:
    ```c
    // 1. naturally
    12.34
    934223.12
    0.0000032
    8/0
    
    // 2. E-notation
    2.52e+8
    8.33E-4
    -18.32e13     // -18.32 being 기수(mantissa), e13 being 지수(exponent)
    7E5
    5.98E24
    9.11e-31
    ```
- basic arithmetic operation
- typecasting
  ```(long) var_name == long (var_name)
- auto type variables
- array type variables
  ```c
  // init - can ONLY initialize values when declaration happens at the same time! can't assign instances
  int cards[4] = {3, 5, 7, 9};
  long totlas[100] = { 3, 1 };    // totals[2]~[99] are initialized with 0 automatically.
  
  // init in c++11 - no longer requires '=' sign!
  double earnings[4] { 1.2e4, 1.6e4, 1.1e4, 1.7e4 };
  // empty curly braces with a space will init them all as 0.
  unsigned int counts[10] { };
  ```
- strings
  - each string should contain '\0' at the end.
  - char type arrays should be strlen + 1 sized minimum.(for null)
- string input
  - cin won't recognize characters after white spaces & will leave the remaining characters in input queue which will eventually lead to problems
  - cin.getline()
    -> reads a line until it meets '\n'
  - cin.get()
    -> reads a line until it meets '\n' then it'll put '\n' in input queue
    ```c
    // to avoid possible errors, use it as below
    cin.get(name_of_var, length including null terminator).get()  // ~.get() will deal with '\n'.
    ```
    ** when get() reads an empty line, it'll set 'failbit' whch will block further input. use cin.clear() to resolve the issue.
    ** getline() and get() will leave remaining input letters exceeding defined length in the input queue. be careful! (getline() will set failbit and disable further input tho)
- string class
