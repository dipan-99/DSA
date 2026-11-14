# Compare adjacent elements and swap them if they are in the wrong order.

# TC = O(n^2)


def bubble_sort(arr):
    n = len(arr)

    for i in range(n):
        swapped = False

        for j in range(n - 1 - i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True

        if not swapped:
            break

    return arr


arr = [5, 3, 8, 2, 1]

print(bubble_sort(arr))
