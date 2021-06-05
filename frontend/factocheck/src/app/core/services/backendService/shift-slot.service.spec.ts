import { TestBed } from '@angular/core/testing';

import { ShiftSlotService } from './shift-slot.service';

describe('ShiftSlotService', () => {
  let service: ShiftSlotService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ShiftSlotService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
