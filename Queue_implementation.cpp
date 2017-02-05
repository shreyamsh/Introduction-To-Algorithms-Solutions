#include <iostream>

using namespace std;

void enqueue(int queue[], int element, int& rear, int arraySize) {
	if(rear == arraySize) {
		cout<<"Queue is overflowing";
	}
	else {
		queue[rear] = element;
		rear++;
	}
}

void dequeue(int queue[], int& front, int rear) {
	if(front == rear) {
		cout<<"Underflow";
	}
	else {
		queue[front] = 0; //deletes the front element
		front++;
	}
}

int Front(int queue[], int front) {
	return queue[front];
}

int size(int front, int rear) {
	return (rear - front);
}

bool isEmpty (int front, int rear) {
	return (front == rear);
}
