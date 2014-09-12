Project Euler Problem 1
=======================

> If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
>
> Find the sum of all the multiples of 3 or 5 below 1000.

This is a simple one-liner in CoffeeScript. Filling an array with values in a range is a simple matter - placing two dots between the numbers creates an array from the first to the last, but three dots is exclusive of the last. As the problem is stated as "below 1000" it makes sense to represent that the same way in the code.

JavaScript's Array reduce method allows us to iterate over the values, modifying an accumulator. In this case we can conditionally add to that value according to whether the current value is a multiple of 3 or 5 - otherwise we return the unmodified accumulator to be used in the next iteration.

    [1...1000].reduce (acc, n) -> if (n % 3 == 0 or n % 5 == 0) then acc + n else acc