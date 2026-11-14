# Take one element at a time and insert it into its correct position in the already sorted portion.

# TC = O(n^2)


def insertion_sort(arr):
    n = len(arr)

    for i in range(1, n):
        key = arr[i]
        j = i - 1

        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = key

    return arr


arr = [5, 3, 8, 2, 1]

print(insertion_sort(arr))
