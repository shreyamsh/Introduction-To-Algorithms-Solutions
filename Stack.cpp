#include <iostream>
using namespace std;
int top = -1;


	void push(int arr[], int x, int n) {
		if(top == n-1) {
			cout<<"stack is full"<<endl;
		}
		else {
			top = top + 1;
			stack[top] = x;
		}
	}

	void pop(int arr[], int n) {
		if(isEmpty()) {
			cout<<"Stack is empty"<<endl;
		}
		else {
			top = top - 1;
		}
	}

	int topElement() {
		return stack[top];
	}

	bool isEmpty() {
		if(top == -1)
			return true;
		else 
			return false;
	}

	int size() {
		return top + 1;
	}

	int main() {
		int stack[3];
		push(stack, 5, 3);
		push(stack, 15, 3);
		push(stack, 10, 3);
		cout<<"Stack size"<< size()<<endl;
		push(stack, 20, 3);

		for(int i=0; i<size(); i++) {
			pop();
		}
		cout<<"Size of stack"<<size()<<endl;
		pop();
		cout<<size()<<endl;
	}
	