function Sum1toN(n) {
    let sum = 0;
    for (i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}


//devuelve la suma del primer y último número en el array
function sumFirstLast(arr) {
    let suma = arr[0] + arr[arr.length - 1];
    return suma;
}




let as1 = Sum1toN(2);
console.log(as1);
let as2 = Sum1toN(3);
console.log(as2);
let as3 = Sum1toN(4);
console.log(as3);

let suma1 = sumFirstLast([1, 2]);
console.log(suma1);
let suma2 = sumFirstLast([2, 3, 8]);
console.log(suma2);
let suma3 = sumFirstLast([-6, 23, 3, -4]);
console.log(suma3);


function reverseArray(arr) {
    for (var i = 0; i < arr.length / 2; i++) {
        temp = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = arr[i];
        arr[i] = temp;
    }
    return arr;
}
b = reverseArray([1, 2, 3]);
console.log('b is', b);



// funciones TDD

describe("Sum1toN", function () {
    it("should return 3 when we pass 2 as an argument", function () {
        expect(Sum1toN(2)).toEqual(3);
    });
    it("should return 6 when we pass 3 as an argument", function () {
        expect(Sum1toN(3)).toEqual(6);
    });
    it("should return 10 when we pass 4 as an argument", function () {
        expect(Sum1toN(4)).toEqual(10);
    });
});

describe("sumFirstLast", function () {
    it("should return 3 when we pass [1,2] as an argument", function () {
        expect(sumFirstLast([1, 2])).toEqual(3);
    });
    it("should return 10 when we pass [2,3,8] as an argument", function () {
        expect(sumFirstLast([2, 3, 8])).toEqual(10);
    });
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function () {
        expect(sumFirstLast([-6, 23, 3, -4])).toEqual(-10);
    });
});


describe("reverseArray", function () {
    it("should return [5,3,1] when [1,3,5] is passed", function () {
        expect(reverseArray([1, 3, 5])).toEqual([5, 3, 1]);
    });
    it("should return [2,4,8,1] when [1,8,4,2] is passed", function () {
        expect(reverseArray([2, 4, 8, 1])).toEqual([1, 8, 4, 2]);
    });
    it("should return [1,2,3] when [3,2,1] is passed", function () {
        expect(reverseArray([1, 2, 3])).toEqual([3, 2, 1]);
    });

});