//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  MF_xfl_singleton                      //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//

package types;

import membership.InputMembershipFunction;

public class MF_xfl_singleton extends InputMembershipFunction {
	double a;

	public MF_xfl_singleton(double min, double max, double step, double single[], double list[]) {
		super.min = min;
		super.max = max;
		super.step = step;
		this.a = single[0];
	}

	public double param(int _i) {
		switch (_i) {
		case 0:
			return a;
		default:
			return 0;
		}
	}

	public double isEqual(double x) {
		return (x == a ? 1 : 0);
	}

	public double isGreaterOrEqual(double x) {
		return (x >= a ? 1 : 0);
	}

	public double isSmallerOrEqual(double x) {
		return (x <= a ? 1 : 0);
	}

	public double center() {
		return a;
	}
}
